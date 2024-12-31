CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    status INTEGER NOT NULL,
    category BIGINT REFERENCES categories(id),
    creation TIMESTAMP NOT NULL,
    deadline TIMESTAMP,
    completion TIMESTAMP
);
