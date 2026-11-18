package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfPractice_Anaia extends OpMode {
    @Override
    public void init (){

    }
    @Override
    public void loop() {
        boolean aButton = gamepad1.a;
        double left_stick = gamepad1.left_stick_y;
        if (aButton) {
            telemetry.addData("Button A is", "pressed!");
        } else {
            telemetry.addData("Button A is", "not pressed!");
        }
        telemetry.addData("A Button State:", aButton);
        if (left_stick < 0) {
            telemetry.addData("Left stick is", "negative.");
        } else if (left_stick > 0) {
            telemetry.addData("Left stick is", "postive.");
        } else {
            telemetry.addData("Left stick is", "zero.");
        }
        telemetry.addData("Left stick is:", left_stick);
    }
}
