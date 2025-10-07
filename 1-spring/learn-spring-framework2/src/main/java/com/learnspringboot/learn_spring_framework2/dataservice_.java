package com.learnspringboot.learn_spring_framework2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

interface DataService {
    int[] retrieveData();
}

@Component
@Primary
class MySQLDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
}

@Component
class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
}

@Component
class BusinessCalculationService {

    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}


@Configuration
@ComponentScan()
public class dataservice_ {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(dataservice_.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
