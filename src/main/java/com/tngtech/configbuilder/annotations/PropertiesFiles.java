package com.tngtech.configbuilder.annotations;

import com.tngtech.configbuilder.annotationprocessors.PropertiesFilesProcessor;
import com.tngtech.configbuilder.annotations.metaannotations.PropertyLoaderConfigurationAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PropertyLoaderConfigurationAnnotation(PropertiesFilesProcessor.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PropertiesFiles {
    String[] value();
    String fileExtension() default "properties";

}
