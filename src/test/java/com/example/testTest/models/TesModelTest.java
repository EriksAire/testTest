package com.example.testTest.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class TesModelTest {

    @Test
    public void tesModelIsNotNull(){
        //Arrange
        TesModel testModel = new TesModel();

        //Act

        //Assert
        Assertions.assertNotNull(testModel);
    }

    @Test
    public void testModelSetValueTest(){
        //Arrange
        TesModel testModel = new TesModel();

        //Act
        testModel.setId(5);

        //Assert
        Assertions.assertEquals(testModel.getId(), 5);
    }

}