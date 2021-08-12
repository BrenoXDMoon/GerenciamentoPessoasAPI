package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDto;
import one.digitalinnovation.personapi.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper mapper = Mappers.getMapper(PersonMapper.class);

    Person toModel(PersonDto personMapper);

    PersonDto toDto(Person person);
}
