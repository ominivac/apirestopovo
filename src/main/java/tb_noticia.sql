/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : dbnoticia

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 06/12/2019 03:33:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_noticia
-- ----------------------------
DROP TABLE IF EXISTS `tb_noticia`;
CREATE TABLE `tb_noticia`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `autor` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `corpo_noticia` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `titulo` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_noticia
-- ----------------------------
INSERT INTO `tb_noticia` VALUES (1, 'Roberto', 'O projeto aprovado pela ALCE destaca em ofício que \"não tem somente fins arrecadatórios\", mas também a intenção de promover mais segurança no trânsito', 'Assembleia aprova anistia de créditos tributários do IPVA e Detran');
INSERT INTO `tb_noticia` VALUES (2, 'Raquel', 'De dezembro a fevereiro, que configura a alta estação do turismo, as cidades cearenses  devem receber 1,2 milhão de visitantes. O número, divulgado pela Secretaria do Turismo do Ceará (Setur), é 6% maior do que no mesmo período de 2018.', 'Ceará deve receber 1,2 milhão de turistas na alta estação');
INSERT INTO `tb_noticia` VALUES (3, 'Fernando', 'Categoria reivindica reestruturação salarial. Protesto teve início a partir do convite de parlamentar da casa, de acordo com presidente da Associação dos Profissionais da Segurança (APS)', 'Policiais e bombeiros fazem manifestação na Assembleia Legislativa');

SET FOREIGN_KEY_CHECKS = 1;
