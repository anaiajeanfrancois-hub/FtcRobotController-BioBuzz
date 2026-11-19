package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.Test_Bench;

@Disabled
@TeleOp
public class TouchSensorPractice extends OpMode {

    Test_Bench bench = new Test_Bench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Touch sensor state:", bench.isTouchSensorPressed());
    }
}
