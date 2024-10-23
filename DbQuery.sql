CREATE DATABASE IF NOT EXISTS game_xxx;
use game_xxx;

CREATE TABLE item_type_t (
item_type_id INT AUTO_INCREMENT NOT NULL,
item_type_name VARCHAR(50),
PRIMARY KEY (item_type_id)
);

CREATE TABLE item_t (
item_id VARCHAR(10) NOT NULL,
item_name VARCHAR(120),
item_type_id INT,
price DECIMAL(21, 6),
PRIMARY KEY (item_id),
CONSTRAINT FK_ItemTable_ItemTypeTable FOREIGN KEY (item_type_id)
REFERENCES item_type_t (item_type_id)
);

CREATE TABLE player_t (
player_id INT AUTO_INCREMENT NOT NULL,
player_name VARCHAR(120),
player_national VARCHAR(50),
PRIMARY KEY (player_id)
);

CREATE TABLE player_item_t (
item_id VARCHAR(10) NOT NULL,
player_id INT NOT NULL,
PRIMARY KEY (item_id, player_id),
CONSTRAINT FK_PlayerItem_ItemTable FOREIGN KEY (item_id) REFERENCES
item_t (item_id),
CONSTRAINT FK_PlayerItem_PlayerTable FOREIGN KEY (player_id)
REFERENCES player_t (player_id)
);

INSERT INTO item_type_t (item_type_name) VALUES ('Attach'), ('Defense');

-- DROP DATABASE IF EXISTS game_xxx;

