package com.example.esd_mini_project.mapper;



import com.example.esd_mini_project.dto.DomainRequest;
import com.example.esd_mini_project.dto.DomainResponse;
import com.example.esd_mini_project.entity.Domain;
import org.springframework.stereotype.Service;

@Service
public class DomainMapper {

    public Domain toDomain(DomainRequest domain)
    {
        return Domain.builder()
                .domain_name(domain.name())
                .capacity(domain.capacity())
                .build();
    }

    public DomainResponse toDomainResponse(Domain domain)
    {
        return new DomainResponse(
                    domain.getDomain_id(),
                    domain.getDomain_name()
        );
    }
}
