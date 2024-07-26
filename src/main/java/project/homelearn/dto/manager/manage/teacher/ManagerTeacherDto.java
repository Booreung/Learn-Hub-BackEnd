package project.homelearn.dto.manager.manage.teacher;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ManagerTeacherDto {

    @NotNull
    private Long teacherId;

    @NotNull
    private String name;

    @NotNull
    private Long curriculumTh;

    @NotNull
    private String curriculumName;

    @NotNull
    private String phone;

    @NotNull
    private String email;
}