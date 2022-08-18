package sda.aprjavapl5.dockerdemo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class Response {
    private String message;
    private LocalDateTime time;
}
