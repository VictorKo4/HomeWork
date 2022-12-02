package homeWork5;

public enum Transfers {
    ;
    public enum Body {
        SEDAN,HATCHBACK,COUPE,ESTATE,SUV,CROSSOVER,PICKUP,VAN,MINIVAN;

        public static void body (Body body) {
            if (body != null) {
                switch (body) {
                    case SEDAN:
                        System.out.println("Тип кузова: Седан");
                        break;
                    case HATCHBACK:
                        System.out.println("Тип кузова: Хетчбэк");
                        break;
                    case COUPE:
                        System.out.println("Тип кузова: Купе");
                        break;
                    case ESTATE:
                        System.out.println("Тип кузова: Универсал");
                        break;
                    case SUV:
                        System.out.println("Тип кузова: Внедорожник");
                        break;
                    case CROSSOVER:
                        System.out.println("Тип кузова: Кроссовер");
                        break;
                    case PICKUP:
                        System.out.println("Тип кузова: Пикап");
                        break;
                    case VAN:
                        System.out.println("Тип кузова: Фургон");
                        break;
                    case MINIVAN:
                        System.out.println("Тип кузова: Минивен");
                        break;
                }
            } else {
                System.out.println("Не указано");
            }
        }

    }
    public enum Weight {
        N1(0f, 3.5f),
        N2(3.5f, 12f),
        N3(12f, 0f);
        private float from;
        private float to;
        Weight (Float from, Float to) {
            this.from = from;
            this.to = to;
        }

        public float getFrom() {
            return from;
        }

        public void setFrom(float from) {
            this.from = from;
        }

        public float getTo() {
            return to;
        }

        public void setTo(float to) {
            this.to = to;
        }
    }
    public enum Capacity {
        ESPECIALLY_SMALL(0, 10),
        SMALL(10, 25),
        MIDDLE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private int from;
        private int to;
        Capacity (int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }
    }
}
