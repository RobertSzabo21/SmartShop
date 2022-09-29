package ro.sda.javaremote38.smartshop.services;

public interface Mapper <E,D>{
    D convertToDto(E entity);
    E convertToEntity(D dto);
}