package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class GamePadPractice_Anaia extends OpMode {


    @Override
    public void init() {

    }
    @Override
    public void loop () {
        double speedForward = ((-1) * gamepad1.left_stick_y)/2;
        double diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_y;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("speedForward", speedForward);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("x", gamepad1.right_stick_x);
        telemetry.addData("x", gamepad1.right_stick_y);
        telemetry.addData("a button", gamepad1.b);
        telemetry.addData("diffXJoysticks", diffXJoysticks);
        telemetry.addData("sumTriggers", sumTriggers);
    }
}
