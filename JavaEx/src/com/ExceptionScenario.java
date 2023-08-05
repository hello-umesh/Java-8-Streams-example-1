package com;
public class ExceptionScenario
{ int count = 0;

    void A() throws Exception
    {
        try
        {
            count++;
            System.out.println("1");
            try
            {
                count++;
                System.out.println("2");
                try
                {
                    count++;
                    System.out.println("3");                    
                    throw new Exception();
                }

                catch(Exception ex)
                {
                    count++;
                    System.out.println("4");
                    throw new Exception();
                }
            }

            catch(Exception ex)
            {
            	System.out.println("5");
                count++;
            }
        }

        catch(Exception ex)
        {
        	System.out.println("6");
            count++;
        }

    }

    void display()
    {
        System.out.println(count); // 5 ( tested value)
    }

    public static void main(String[] args) throws Exception
    {
    	ExceptionScenario obj = new ExceptionScenario();
        obj.A();
        obj.display();
    }
}
