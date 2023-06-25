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
