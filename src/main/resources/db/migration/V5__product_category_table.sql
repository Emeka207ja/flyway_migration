-- CREATE PRODUCT-CATEGORY JOIN TABLE
CREATE TABLE product_category(
    category_id BIGINT,
    product_id BIGINT,
    PRIMARY KEY (category_id, product_id),
    FOREIGN KEY (category_id) REFERENCES category(category_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);