package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class VariableExercise_Anaia extends OpMode {

    @Override
    public void init() {
        int team_number = 21377;
        String team_name = "Saint Ann's School Botsworth";
        double motor_speed = 0.5;
        boolean touch_sensor_pressed = false;
        int motor_angle = 100;

        telemetry.addData("Team Number", team_number);
        telemetry.addData("Team Name", team_name);
        telemetry.addData("Motor Angle", motor_angle);
        telemetry.addData("Motor Speed", motor_speed);
        telemetry.addData("Touch Sensor Pressed", touch_sensor_pressed);
    }

    @Override
    public void loop() {

    }
}
