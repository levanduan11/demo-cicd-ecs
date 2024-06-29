CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NULL,
    email    VARCHAR(255) NULL
);

INSERT INTO users (username, email) VALUES ('admin', 'admin@localhost');
INSERT INTO users (username, email) VALUES ('user', 'user@localhost');
