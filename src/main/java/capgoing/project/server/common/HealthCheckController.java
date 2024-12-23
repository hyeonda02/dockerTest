package capgoing.project.server.common;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "헬스 체크", description = "애플리케이션의 상태를 확인하는 API입니다.")
public class HealthCheckController {

    @Operation(summary = "헬스 체크 엔드포인트", description = "현재 커밋 해시 또는 기본 메시지를 반환합니다.")
    @GetMapping("/health-check")
    public String healthCheck() {
        return "테스트용으로 커밋 해시가 설정되지 않았습니다.";
    }
}
