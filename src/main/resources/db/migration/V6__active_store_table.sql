-- Add ActiveStore table
CREATE TABLE active_store (
    active_store_id BIGINT PRIMARY KEY,
    store_id BIGINT,
    name VARCHAR(255),
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES user_model (user_id)
);

-- Add foreign key constraint to UserModel table
ALTER TABLE active_store ADD CONSTRAINT FK_active_store_user_model FOREIGN KEY (user_id) REFERENCES user_model (user_id);
