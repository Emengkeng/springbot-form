package com.juslen.form.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactForm {
    @NotEmpty
    private String first;

    @NotEmpty
    private String last;

    @NotEmpty
    private String email;

    private String comment;
}
