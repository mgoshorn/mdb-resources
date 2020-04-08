package com.mdb.dtos;

import java.util.Objects;

public class ErrorResponseDTO {
    private String message;
    private String element;
    private String failure;


    public ErrorResponseDTO() {
    }

    public ErrorResponseDTO(String message, String element, String failure) {
        this.message = message;
        this.element = element;
        this.failure = failure;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getFailure() {
        return this.failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public ErrorResponseDTO message(String message) {
        this.message = message;
        return this;
    }

    public ErrorResponseDTO element(String element) {
        this.element = element;
        return this;
    }

    public ErrorResponseDTO failure(String failure) {
        this.failure = failure;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ErrorResponseDTO)) {
            return false;
        }
        ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) o;
        return Objects.equals(message, errorResponseDTO.message) && Objects.equals(element, errorResponseDTO.element) && Objects.equals(failure, errorResponseDTO.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, element, failure);
    }

    @Override
    public String toString() {
        return "{" +
            " message='" + getMessage() + "'" +
            ", element='" + getElement() + "'" +
            ", failure='" + getFailure() + "'" +
            "}";
    }

}