package com.example.javaarchunit.space;

import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.example.javaarchunit")
//@AnalyzeClasses
@Mike
public class ArchitectureTest {

    @ArchTest
    static final ArchRule shouldHaveDataAnnotation =
            classes().that().resideInAPackage("com.example.javaarchunit.space")
                    .should().beAnnotatedWith(Mike.class)
                    .andShould()
                    .haveModifier(JavaModifier.PUBLIC);
}