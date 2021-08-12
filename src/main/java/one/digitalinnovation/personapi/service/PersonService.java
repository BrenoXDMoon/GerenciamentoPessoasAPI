package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.request.PersonDto;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.mapper.PersonMapper;
import one.digitalinnovation.personapi.model.Person;
import one.digitalinnovation.personapi.repositories.PersonRepository;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    private final PersonMapper mapper = PersonMapper.mapper;

    public MessageResponseDTO criaPerson(PersonDto personDto) {

        Person person = mapper.toModel(personDto);

        Person savedPerson = repository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Pessoa criada com o ID: " + savedPerson.getId())
                .build();
    }
}
