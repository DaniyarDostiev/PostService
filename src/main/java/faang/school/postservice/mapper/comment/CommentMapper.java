package faang.school.postservice.mapper.comment;

import faang.school.postservice.dto.comment.CommentDto;
import faang.school.postservice.model.Comment;
import org.mapstruct.*;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {

    Comment toEntity(CommentDto commentDto);

    @Mapping(target = "postId", source = "post.id")
    CommentDto toDto(Comment comment);

    void update(@MappingTarget Comment comment, CommentDto commentDto);
}
