// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.utils;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PS4Controller.Button;

/** Add your docs here. */
public class ButtonBoard extends GenericHID {

    public ButtonBoard(final int port){
        super(port);
    }

}
