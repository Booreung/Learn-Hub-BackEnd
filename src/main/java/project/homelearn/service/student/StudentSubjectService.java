package project.homelearn.service.student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.homelearn.dto.teacher.dashboard.QuestionTop5Dto;
import project.homelearn.dto.teacher.lecture.LectureListDto;
import project.homelearn.dto.teacher.subject.SubjectBasicDto;
import project.homelearn.dto.teacher.subject.SubjectBoardTop5Dto;
import project.homelearn.repository.board.QuestionBoardRepository;
import project.homelearn.repository.board.SubjectBoardRepository;
import project.homelearn.repository.curriculum.LectureRepository;
import project.homelearn.repository.curriculum.SubjectRepository;

import java.util.List;


/**
 * Author : 김승민
 */
@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class StudentSubjectService {

    private final SubjectRepository subjectRepository;
    private final SubjectBoardRepository subjectBoardRepository;
    private final QuestionBoardRepository questionBoardRepository;
    private final LectureRepository lectureRepository;


    public SubjectBasicDto getSubjectBasic(Long subjectId) {

        return subjectRepository.findSubjectBasic(subjectId);
    }

    public List<SubjectBoardTop5Dto> getSubjectBoardTop5(Long subjectId) {
        return subjectBoardRepository.findSubjectBoardTop5(subjectId);
    }

    public List<QuestionTop5Dto> getQuestionTop5(Long subjectId) {
        return questionBoardRepository.findQuestionTop5BySubjectId(subjectId);
    }

    public Page<LectureListDto> getSubjectLecturePage(Long subjectId, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return lectureRepository.findSubjectLecturePage(subjectId, pageRequest);
    }
}
