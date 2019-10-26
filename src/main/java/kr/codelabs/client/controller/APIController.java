package kr.codelabs.client.controller;

import kr.codelabs.client.service.APIService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class APIController {

    private APIService apiService;

    @GetMapping("/access-token")
    public String getAccessToken() {
        return apiService.getAccessToken();
    }

    @GetMapping("/members")
    public String getMembers() {
        return apiService.getUsers();
    }
}
