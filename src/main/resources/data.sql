DROP TABLE IF EXISTS `cart_items`;
DROP TABLE IF EXISTS `carts`;
DROP TABLE IF EXISTS `articles`;
DROP TABLE IF EXISTS `users`;

CREATE TABLE IF NOT EXISTS `users` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `name` varchar(200) NOT NULL,
 PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `articles` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `user_id` bigint(20),
 `name` varchar(200) NOT NULL,
 PRIMARY KEY (`id`),
 FOREIGN KEY (`user_id`) REFERENCES users(`id`)
);

CREATE TABLE IF NOT EXISTS `carts` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `user_id` bigint(20),
 `name` varchar(200) NOT NULL,
 PRIMARY KEY (`id`),
 FOREIGN KEY (`user_id`) REFERENCES users(`id`)
);

CREATE TABLE IF NOT EXISTS `cart_items` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `cart_id` bigint(20) NOT NULL,
 `article_id` bigint(20) NOT NULL,
 PRIMARY KEY (`id`),
 FOREIGN KEY (`cart_id`) REFERENCES carts(`id`),
 FOREIGN KEY (`article_id`) REFERENCES articles(`id`)
);