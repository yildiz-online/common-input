/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *  Copyright (c) 2026 Grégory Van den Borre
 *  More infos available: https://engine.yildiz-games.be
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 *  the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 *  permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright
 *  notice and this permission notice shall be included in all copies or substantial portions of the  Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 *  OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package be.yildizgames.common.input;

/**
 * Simulate a controller with a keyboard.
 *
 * @author Grégory Van den Borre
 */
public class UseKeyboardAsController implements UseAs<KeyboardInput, ControllerInput> {

    private final KeyboardInput button1;
    private final KeyboardInput button2;
    private final KeyboardInput button3;
    private final KeyboardInput button4;
    private final KeyboardInput buttonL1;
    private final KeyboardInput buttonL2;
    private final KeyboardInput buttonR1;
    private final KeyboardInput buttonR2;
    private final KeyboardInput buttonStart;
    private final KeyboardInput buttonSelect;
    private final KeyboardInput up;
    private final KeyboardInput down;
    private final KeyboardInput left;
    private final KeyboardInput right;

    public UseKeyboardAsController(
            KeyboardInput button1,
            KeyboardInput button2,
            KeyboardInput button3,
            KeyboardInput button4,
            KeyboardInput buttonL1,
            KeyboardInput buttonL2,
            KeyboardInput buttonR1,
            KeyboardInput buttonR2,
            KeyboardInput buttonStart,
            KeyboardInput buttonSelect,
            KeyboardInput up,
            KeyboardInput down,
            KeyboardInput left,
            KeyboardInput right) {
        super();
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
        this.buttonL1 = buttonL1;
        this.buttonL2 = buttonL2;
        this.buttonR1 = buttonR1;
        this.buttonR2 = buttonR2;
        this.buttonStart = buttonStart;
        this.buttonSelect = buttonSelect;
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    @Override
    public ControllerInput from(KeyboardInput from) {
        if (from == this.up) {
            return ControllerInput.UP;
        } else if (from == this.down) {
            return ControllerInput.DOWN;
        } else if (from == this.left) {
            return ControllerInput.LEFT;
        } else if (from == this.right) {
            return ControllerInput.RIGHT;
        } else if (from == this.button1) {
            return ControllerInput.BUTTON1;
        } else if (from == this.button2) {
            return ControllerInput.BUTTON2;
        } else if (from == this.button3) {
            return ControllerInput.BUTTON3;
        } else if (from == this.button4) {
            return ControllerInput.BUTTON4;
        } else if (from == this.buttonL1) {
            return ControllerInput.BUTTON_L1;
        } else if (from == this.buttonL2) {
            return ControllerInput.BUTTON_L2;
        } else if (from == this.buttonR1) {
            return ControllerInput.BUTTON_R1;
        } else if (from == this.buttonR2) {
            return ControllerInput.BUTTON_R2;
        } else if (from == this.buttonSelect) {
            return ControllerInput.SELECT;
        } else if (from == this.buttonStart) {
            return ControllerInput.START;
        }
        return ControllerInput.NOTHING;
    }
}
