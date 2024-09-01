package com.garguir;

import com.garguir.api.GitLabApi;

import java.io.IOException;
import java.util.List;

public class Metrics {
    private static final String DEPENDENCY_TO_FIND = "<dependency>";

    public static void main(String[] args) {
        try {
            List<Integer> projectIds = GitLabApi.getRepositories();
            for (int projectId : projectIds) {
                List<String> filePaths = GitLabApi.listFilesInRepo(projectId);
                for (String filePath : filePaths) {
                    if (filePath.endsWith("pom.xml")) {
                        String fileContent = GitLabApi.getFileContent(projectId, filePath);
                        if (GitLabApi.containsDependency(fileContent, DEPENDENCY_TO_FIND)) {
                            System.out.println("Dependency found in project ID " + projectId + ", file: " + filePath);
                        }
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}