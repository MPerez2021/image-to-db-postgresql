package com.proyect.uploadImages.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Lob;

public class ProductToSaveDto {

    @NotNull
    @Getter @Setter
    private String name;

    @NotNull
    @Getter
    @Setter
    private Double price;

    @NotNull
    @Getter @Setter
    private String description;

    @NotNull
    @Getter @Setter
    private String category;

    @NotNull
    @Getter @Setter
    private MultipartFile image;

}
