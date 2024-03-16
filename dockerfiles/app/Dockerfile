FROM gradle:latest
LABEL authors="shinnosuke"

WORKDIR /app

COPY . .

RUN chmod u+x gradlew

CMD ["./gradlew", "bootRun"]