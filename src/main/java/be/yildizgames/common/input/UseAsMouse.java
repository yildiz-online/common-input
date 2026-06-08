package be.yildizgames.common.input;

public abstract class UseAsMouse<F> implements UseAs<F, Mouse> {

    @Override
    public Mouse from(F from) {
        if(from == moveLeft()) {
            return Mouse.MOVE_LEFT;
        } else if (from == moveRight()) {
            return Mouse.MOVE_RIGHT;
        } else if (from == moveUp()) {
            return Mouse.MOVE_UP;
        } else if (from == moveDown()) {
            return Mouse.MOVE_DOWN;
        } else if (from == moveLeftButton()) {
            return Mouse.LEFT_BUTTON;
        } else if (from == moveRightButton()) {
            return Mouse.RIGHT_BUTTON;
        } else if (from == moveMiddleButton()) {
            return Mouse.MIDDLE_BUTTON;
        }
        return Mouse.NOTHING;
    }

    protected abstract F moveLeft();
    protected abstract F moveRight();
    protected abstract F moveUp();
    protected abstract F moveDown();
    protected abstract F moveLeftButton();
    protected abstract F moveRightButton();
    protected abstract F moveMiddleButton();

}
