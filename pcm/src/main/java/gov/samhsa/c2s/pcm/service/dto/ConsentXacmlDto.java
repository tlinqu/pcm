package gov.samhsa.c2s.pcm.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class ConsentXacmlDto {

    @NotBlank
    private String consentRefId;
    @NotEmpty
    private byte[] consentXacml;
    @NotBlank
    private String consentXacmlEncoding;
}
