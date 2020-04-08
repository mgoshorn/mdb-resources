package com.mdb.exceptions;

import java.util.Objects;

import com.mdb.dtos.ErrorResponseDTO;

public class HttpException extends RuntimeException {
    private static final long serialVersionUID = 7742453071496510730L;
    private int statusCode;
    private ErrorResponseDTO errorResponse;


    public HttpException() {
    }

    public HttpException(int statusCode, String message, String element, String failure) {
        this.statusCode = statusCode;
        this.errorResponse = new ErrorResponseDTO(message, element, failure);
    }

    public HttpException(int statusCode, ErrorResponseDTO errorResponse) {
        this.statusCode = statusCode;
        this.errorResponse = errorResponse;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ErrorResponseDTO getErrorResponse() {
        return this.errorResponse;
    }

    public void setErrorResponse(ErrorResponseDTO errorResponse) {
        this.errorResponse = errorResponse;
    }

    public HttpException statusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public HttpException errorResponse(ErrorResponseDTO errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HttpException)) {
            return false;
        }
        HttpException httpException = (HttpException) o;
        return statusCode == httpException.statusCode && Objects.equals(errorResponse, httpException.errorResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, errorResponse);
    }

    @Override
    public String toString() {
        return "{" +
            " statusCode='" + getStatusCode() + "'" +
            ", errorResponse='" + getErrorResponse() + "'" +
            "}";
    }

}