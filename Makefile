help:
	@echo make build
	@echo make test
	@echo make run

build:
	sbt build

test:
	sbt test

run:
	sbt run

run1:
  sbt run-main com.oax.hello.hello

run2:
  sbt run-main com.oax.threads.SingleThread
