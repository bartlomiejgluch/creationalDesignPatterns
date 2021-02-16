package org.example.factoryMethodPattern;

public class GetPlanFactory {

    public Plan getPlan(String planType){

        if (planType == null){

            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")){

            return new DomesticPlan();
        }
        else if (planType.equalsIgnoreCase("COMMERCIALPLAN")){

            return new CommercialPlan();
        }
        else if (planType.equalsIgnoreCase("INSTITUTIONAL")){

            return new InstitutionalPlan();
        }
        return null;





    }


}
