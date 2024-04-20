CREATE TABLE product(
    product_id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    quantity INTEGER,
    store_id BIGINT,
    FOREIGN KEY (store_id) REFERENCES store(store_id)
);