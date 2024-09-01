package com.garguir.api;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class GitLabApi {

    private static final String GITLAB_API_URL = "https://gitlab.com/api/v4";
    private static final String PRIVATE_TOKEN = "YOUR_PRIVATE_TOKEN_HERE";
    private static final int PER_PAGE = 100; // Número máximo de resultados por página permitido por GitLab

    public static List<Integer> getRepositories() throws IOException, InterruptedException {
        List<Integer> projectIds = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        int page = 1;
        boolean hasMore = true;

        while (hasMore) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(GITLAB_API_URL + "/projects?membership=true&per_page=" + PER_PAGE + "&page=" + page))
                    .header("PRIVATE-TOKEN", PRIVATE_TOKEN)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONArray jsonArray = new JSONArray(response.body());

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int projectId = jsonObject.getInt("id");
                String projectName = jsonObject.getString("name");
                projectIds.add(projectId);
            }

            // Si el número de resultados es menor que `PER_PAGE`, significa que no hay más páginas
            if (jsonArray.length() < PER_PAGE) {
                hasMore = false;
            } else {
                page++;
            }
        }

        return projectIds;
    }

    public static List<String> listFilesInRepo(int projectId) throws IOException, InterruptedException {
        List<String> filePaths = new ArrayList<>();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(GITLAB_API_URL + "/projects/" + projectId + "/repository/tree?recursive=true"))
                .header("PRIVATE-TOKEN", PRIVATE_TOKEN)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONArray jsonArray = new JSONArray(response.body());

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String filePath = jsonObject.getString("path");
            filePaths.add(filePath);
        }

        return filePaths;
    }

    public static String getFileContent(int projectId, String filePath) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(GITLAB_API_URL + "/projects/" + projectId + "/repository/files/" + filePath + "/raw?ref=master"))
                .header("PRIVATE-TOKEN", PRIVATE_TOKEN)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public static boolean containsDependency(String fileContent, String dependency) {
        return fileContent.contains(dependency);
    }
}
