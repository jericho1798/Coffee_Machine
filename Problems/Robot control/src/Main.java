class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        do {
            if (toX > robot.getX()) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case RIGHT:
                        robot.stepForward();
                        break;
                }
            }
            if (toX < robot.getX()) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.stepForward();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                }
            }
        }
        while (robot.getX() != toX);
        do {
            if (toY > robot.getY()) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                }
            }
            if (toY < robot.getY()) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                }

            }
        } while (robot.getY() != toY);
    }
}



//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
