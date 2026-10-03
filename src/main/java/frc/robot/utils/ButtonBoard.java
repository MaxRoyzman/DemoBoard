// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.utils;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.CommandGenericHID;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/** Add your docs here. */
public class ButtonBoard extends CommandGenericHID {

    public enum joystickAxis{
        kX(0), //left is -1, right is 1
        kY(1); //forward is -1, backwards is 1

        public final int value;

        joystickAxis(int value){
            this.value = value;
        }

    }

    public enum buttonNum{
        k1(1),
        k2(2),
        k3(3),
        k4(4),
        k5(5),
        k6(6),
        k7(7),
        k8(8),
        k9(9),
        k10(10),
        k11(11),
        k12(12);


        public final int value;

        buttonNum(int value){
            this.value = value;
        }
    }

    public ButtonBoard(final int port){
        super(port);
    }

    //rename buttons to more specific ones after building real board
    public Trigger k1(){
        return button(buttonNum.k1.value);
    }

    public Trigger k2(){
        return button(buttonNum.k2.value);
    }
    public Trigger k3(){
        return button(buttonNum.k3.value);
    }
    public Trigger k4(){
        return button(buttonNum.k4.value);
    }
    public Trigger k5(){
        return button(buttonNum.k5.value);
    }
    public Trigger k6(){
        return button(buttonNum.k7.value);
    }
    public Trigger k7(){
        return button(buttonNum.k7.value);
    }
    public Trigger k8(){
        return button(buttonNum.k8.value);
    }
    public Trigger k9(){
        return button(buttonNum.k9.value);
    }
    public Trigger k10(){
        return button(buttonNum.k10.value);
    }
    public Trigger k11(){
        return button(buttonNum.k11.value);
    }
    public Trigger k12(){
        return button(buttonNum.k12.value);
    }


    public double getY(){
        return getRawAxis(joystickAxis.kY.value);
    }

    public double getX(){
        return getRawAxis(joystickAxis.kX.value);
    }


    //for funsies
    public double getJoystickAxis(joystickAxis axis){
        return getRawAxis(axis.value);
    }

}
