# Rizz - An RSS Feed Reader

WIP: A basic RSS/Atom feed reader built with Spring Boot. MVP scope.

## Stack

- Java 21, Spring Boot 3.3.1
- Spring Web
- Spring Data JPA
- PostgreSQL
- [Rome](https://github.com/rometools/rome) for feed parsing

## Planned MPV Features

- [ ] Add a feed by URL
- [ ] Fetch and parse feed metadata (title, description, items)
- [ ] View feed list and item details

## Planned Post-MPV Features

- [ ] Full article fetching using `jsoup`
- [ ] Scheduled feed refresh + dedup by GUID
- [ ] Read/unread tracking

## Getting Started

App runs on `http://localhost:8080`.

```bash
./mvnw spring-boot:run
```
