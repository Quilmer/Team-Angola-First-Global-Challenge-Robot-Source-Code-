package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "HojeLB (Blocks to Java)")
public class HojeLB extends LinearOpMode {

  private DcMotor MD0;
  private DcMotor ME1;
  private DcMotor Sug;
  private DcMotor Sug2;
  private DcMotor MPenD0;
  private DcMotor MPenE1;
  private DcMotor Ace;
  private CRServo Srigth;
  private CRServo Sleft;
  private Servo Braleft;
  private Servo Braright;

  /**
   * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
   * Comment Blocks show where to place Initialization code (runs once, after touching the
   * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
   * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
   * Stopped).j.
   */
  @Override
  public void runOpMode() {
    float x;
    float y;
    float Power0;
    float Power1;

    MD0 = hardwareMap.get(DcMotor.class, "MD0");
    ME1 = hardwareMap.get(DcMotor.class, "ME1");
    Sug = hardwareMap.get(DcMotor.class, "Sug");
    Sug2 = hardwareMap.get(DcMotor.class, "Sug2");
    MPenD0 = hardwareMap.get(DcMotor.class, "MPenD0");
    MPenE1 = hardwareMap.get(DcMotor.class, "MPenE1");
    Ace = hardwareMap.get(DcMotor.class, "Ace");
    Srigth = hardwareMap.get(CRServo.class, "Srigth");
    Sleft = hardwareMap.get(CRServo.class, "Sleft");
    Braleft = hardwareMap.get(Servo.class, "Braleft");
    Braright = hardwareMap.get(Servo.class, "Braright");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      MD0.setDirection(DcMotor.Direction.REVERSE);
      ME1.setDirection(DcMotor.Direction.FORWARD);
      while (opModeIsActive()) {
        // Put loop blocks here.
        x = -gamepad1.left_stick_x;
        y = -gamepad1.left_stick_y;
        Power0 = y - x;
        Power1 = x + y;
        MD0.setPower(Power0);
        ME1.setPower(Power1);
        if (gamepad1.right_bumper) {
          Sug.setPower(-1);
          Sug2.setPower(1);
        } else {
          Sug.setPower(0);
          Sug2.setPower(0);
        }
        if (gamepad1.left_bumper) {
          Sug.setPower(1);
          Sug2.setPower(-1);
        }
        if (gamepad1.dpad_up) {
          Sug.setPower(0);
          Sug2.setPower(0);
        }
        if (gamepad1.cross) {
          MPenD0.setPower(-1);
          MPenE1.setPower(-1);
        } else {
          MPenD0.setPower(0);
          MPenE1.setPower(0);
        }
        if (gamepad1.triangle) {
          MPenE1.setPower(1);
          MPenD0.setPower(1);
        }
        if (gamepad1.circle) {
          Ace.setPower(1);
        }
        if (gamepad1.square) {
          Ace.setPower(0);
          Srigth.setPower(0);
          Sleft.setPower(0);
        }
        if (gamepad1.dpad_up) {
          Srigth.setPower(1);
          Sleft.setPower(-1);
        }
        if (gamepad1.dpad_down) {
          Sleft.setPower(1);
          Srigth.setPower(-1);
        }
        if (gamepad1.dpad_right) {
          Braleft.setPosition(130 / 180);
          Braright.setPosition(65 / 180);
        }
        if (gamepad1.dpad_left) {
          Braleft.setPosition(60 / 180);
          Braright.setPosition(165 / 180);
        }
      }
    }
  }
}
