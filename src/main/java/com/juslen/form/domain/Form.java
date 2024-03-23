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
public class Form {
    @NotEmpty
    private String first;

    @NotEmpty
    private String last;

    private String comment;
}
