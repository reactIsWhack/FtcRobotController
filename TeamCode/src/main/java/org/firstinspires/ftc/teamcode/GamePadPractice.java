package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double leftJoystickY = (gamepad1.left_stick_y * -1)/2;
        double leftJoystickX = gamepad1.left_stick_x;
        double rightJoystickX = gamepad1.right_stick_x;
        double rightJoystickY = (gamepad1.right_stick_y * -1)/2;

        double xDiff = leftJoystickX - rightJoystickX;
        double rearTriggerSum = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("x left joystick", leftJoystickX);
        telemetry.addData("Y left joystick", leftJoystickY);
        telemetry.addData("X right joystick", rightJoystickX);
        telemetry.addData("Y right joystick", rightJoystickY);
        telemetry.addData("X diff", xDiff);
        telemetry.addData("Trigger sum", rearTriggerSum);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);
    }
}
