CREATE TABLE store(
    store_id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    location VARCHAR(255),
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES user_model(user_id)
);