/*==============================================================*/
/* Database: TTMS                                               */
/*==============================================================*/
create database TTMS
go

USE TTMS
GO
/****** Object:  Table [dbo].[studio]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[studio](
	[studio_id] [int] IDENTITY(1,1) NOT NULL,
	[studio_name] [varchar](100) NOT NULL,
	[studio_row_count] [int] NULL,
	[studio_col_count] [int] NULL,
	[studio_introduction] [varchar](2000) NULL,
 CONSTRAINT [PK_STUDIO] PRIMARY KEY NONCLUSTERED 
(
	[studio_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[studio] ON
INSERT [dbo].[studio] ([studio_id], [studio_name], [studio_row_count], [studio_col_count], [studio_introduction]) VALUES (15, N'1号厅', 8, 8, N'1号激光巨幕厅')
INSERT [dbo].[studio] ([studio_id], [studio_name], [studio_row_count], [studio_col_count], [studio_introduction]) VALUES (16, N'2号厅', 10, 10, N'2号激光max观影厅')
INSERT [dbo].[studio] ([studio_id], [studio_name], [studio_row_count], [studio_col_count], [studio_introduction]) VALUES (18, N'3号厅', 8, 8, N'3号会员观影厅')
INSERT [dbo].[studio] ([studio_id], [studio_name], [studio_row_count], [studio_col_count], [studio_introduction]) VALUES (19, N'4号厅', 6, 6, N'4号私人承包超值观影厅')
INSERT [dbo].[studio] ([studio_id], [studio_name], [studio_row_count], [studio_col_count], [studio_introduction]) VALUES (20, N'5号厅', 15, 15, N'5号礼堂式观影厅')
SET IDENTITY_INSERT [dbo].[studio] OFF
/****** Object:  Table [dbo].[employee]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[employee](
	[emp_id] [int] IDENTITY(1,1) NOT NULL,
	[emp_no] [char](20) NOT NULL,
	[emp_name] [varchar](100) NOT NULL,
	[emp_tel_num] [char](20) NULL,
	[emp_addr] [varchar](200) NULL,
	[emp_email] [varchar](100) NULL,
 CONSTRAINT [PK_EMPLOYEE] PRIMARY KEY NONCLUSTERED 
(
	[emp_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[employee] ON
INSERT [dbo].[employee] ([emp_id], [emp_no], [emp_name], [emp_tel_num], [emp_addr], [emp_email]) VALUES (7, N'1                   ', N'张三', N'18888888888         ', N'高新区 ', N'188888888@qq.com ')
INSERT [dbo].[employee] ([emp_id], [emp_no], [emp_name], [emp_tel_num], [emp_addr], [emp_email]) VALUES (8, N'2                   ', N'李四', N'14444444444         ', N'长安区 ', N'144444444@qq.com ')
SET IDENTITY_INSERT [dbo].[employee] OFF
/****** Object:  Table [dbo].[data_dict]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[data_dict](
	[dict_id] [int] IDENTITY(1,1) NOT NULL,
	[dict_parent_id] [int] NULL,
	[dict_index] [int] NULL,
	[dict_name] [varchar](200) NULL,
	[dict_value] [varchar](100) NOT NULL,
 CONSTRAINT [PK_DATA_DICT] PRIMARY KEY NONCLUSTERED 
(
	[dict_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[data_dict] ON
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (1, NULL, 1, N'TTMS数据字典', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (2, 1, 1, N'影片类型', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (3, 1, 2, N'语言类型', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (4, 2, 1, N'喜剧片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (5, 2, 2, N'恐怖片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (6, 2, 3, N'爱情片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (7, 2, 4, N'动作片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (8, 2, 5, N'科幻片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (9, 2, 6, N'武侠片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (10, 2, 7, N'战争片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (11, 2, 8, N'犯罪片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (12, 2, 9, N'惊悚片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (13, 2, 10, N'剧情片', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (14, 3, 1, N'国语', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (15, 3, 2, N'英语', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (16, 3, 3, N'日语', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (17, 3, 4, N'韩语', N'0')
INSERT [dbo].[data_dict] ([dict_id], [dict_parent_id], [dict_index], [dict_name], [dict_value]) VALUES (18, 3, 5, N'法语', N'0')
SET IDENTITY_INSERT [dbo].[data_dict] OFF
/****** Object:  Table [dbo].[sale]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sale](
	[sale_ID] [bigint] IDENTITY(1,1) NOT NULL,
	[emp_id] [int] NULL,
	[sale_time] [datetime] NULL,
	[sale_payment] [decimal](10, 2) NULL,
	[sale_change] [numeric](10, 2) NULL,
	[sale_type] [smallint] NULL,
	[sale_status] [smallint] NULL,
 CONSTRAINT [PK_SALE] PRIMARY KEY NONCLUSTERED 
(
	[sale_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'类别取值含义：
   1：销售单
   -1：退款单' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'sale', @level2type=N'COLUMN',@level2name=N'sale_type'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'销售单状态如下：
   0：代付款
   1：已付款' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'sale', @level2type=N'COLUMN',@level2name=N'sale_status'
GO
SET IDENTITY_INSERT [dbo].[sale] ON
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (17, 7, CAST(0x0000A78500CF4AA8 AS DateTime), CAST(1000.00 AS Decimal(10, 2)), CAST(10.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (18, 8, CAST(0x0000A78500CF78B8 AS DateTime), CAST(1000.00 AS Decimal(10, 2)), CAST(136.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (19, 7, CAST(0x0000A78600CFC4C2 AS DateTime), CAST(1000.00 AS Decimal(10, 2)), CAST(104.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (20, 7, CAST(0x0000A78700CFE37B AS DateTime), CAST(1100.00 AS Decimal(10, 2)), CAST(44.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (21, 8, CAST(0x0000A78800D031CC AS DateTime), CAST(1100.00 AS Decimal(10, 2)), CAST(92.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (22, 7, CAST(0x0000A78900D06A63 AS DateTime), CAST(350.00 AS Decimal(10, 2)), CAST(35.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (23, 7, CAST(0x0000A78A00D09103 AS DateTime), CAST(500.00 AS Decimal(10, 2)), CAST(68.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (24, 7, CAST(0x00008F4900D09103 AS DateTime), CAST(100000.00 AS Decimal(10, 2)), CAST(32.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (25, 8, CAST(0x000090B600D09103 AS DateTime), CAST(80000.00 AS Decimal(10, 2)), CAST(20.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (26, 8, CAST(0x0000922300D09103 AS DateTime), CAST(90000.00 AS Decimal(10, 2)), CAST(1.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (27, 7, CAST(0x0000939000D09103 AS DateTime), CAST(70000.00 AS Decimal(10, 2)), CAST(70.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (28, 7, CAST(0x000094FE00D09103 AS DateTime), CAST(200000.00 AS Decimal(10, 2)), CAST(32.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (29, 8, CAST(0x0000966B00D09103 AS DateTime), CAST(180000.00 AS Decimal(10, 2)), CAST(12.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (30, 8, CAST(0x000097D800D09103 AS DateTime), CAST(70000.00 AS Decimal(10, 2)), CAST(0.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (31, 7, CAST(0x0000994500D09103 AS DateTime), CAST(300000.00 AS Decimal(10, 2)), CAST(20000.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (32, 8, CAST(0x00009AB300D09103 AS DateTime), CAST(150000.00 AS Decimal(10, 2)), CAST(80.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (33, 7, CAST(0x00009C2000D09103 AS DateTime), CAST(60000.00 AS Decimal(10, 2)), CAST(30.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (34, 8, CAST(0x00009D8D00D09103 AS DateTime), CAST(100000.00 AS Decimal(10, 2)), CAST(20.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (35, 7, CAST(0x00009EFA00D09103 AS DateTime), CAST(80000.00 AS Decimal(10, 2)), CAST(30.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (36, 8, CAST(0x0000A06800D09103 AS DateTime), CAST(120000.00 AS Decimal(10, 2)), CAST(10000.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (37, 8, CAST(0x0000A1D500D09103 AS DateTime), CAST(150000.00 AS Decimal(10, 2)), CAST(20000.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (38, 7, CAST(0x0000A34200D09103 AS DateTime), CAST(120000.00 AS Decimal(10, 2)), CAST(1000.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (39, 8, CAST(0x0000A4AF00D09103 AS DateTime), CAST(90000.00 AS Decimal(10, 2)), CAST(800.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (40, 7, CAST(0x0000A61D00D09103 AS DateTime), CAST(130000.00 AS Decimal(10, 2)), CAST(200.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (41, 7, CAST(0x0000A6EE00CF4AA8 AS DateTime), CAST(15000.00 AS Decimal(10, 2)), CAST(100.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (42, 7, CAST(0x0000A70D00CF4AA8 AS DateTime), CAST(12000.00 AS Decimal(10, 2)), CAST(100.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (43, 7, CAST(0x0000A72900CF4AA8 AS DateTime), CAST(20000.00 AS Decimal(10, 2)), CAST(0.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (44, 7, CAST(0x0000A74800CF4AA8 AS DateTime), CAST(10000.00 AS Decimal(10, 2)), CAST(80.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (45, 7, CAST(0x0000A76600CF4AA8 AS DateTime), CAST(15000.00 AS Decimal(10, 2)), CAST(1000.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (47, 7, CAST(0x0000A78A017A9DF8 AS DateTime), CAST(200.00 AS Decimal(10, 2)), CAST(65.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (48, 8, CAST(0x0000A78B00058035 AS DateTime), CAST(100.00 AS Decimal(10, 2)), CAST(10.00 AS Numeric(10, 2)), 1, 1)
INSERT [dbo].[sale] ([sale_ID], [emp_id], [sale_time], [sale_payment], [sale_change], [sale_type], [sale_status]) VALUES (49, 7, CAST(0x0000A78B0088B0F1 AS DateTime), CAST(100.00 AS Decimal(10, 2)), CAST(10.00 AS Numeric(10, 2)), 1, 1)
SET IDENTITY_INSERT [dbo].[sale] OFF
/****** Object:  Table [dbo].[play]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[play](
	[play_id] [int] IDENTITY(1,1) NOT NULL,
	[play_type_id] [int] NULL,
	[play_lang_id] [int] NULL,
	[play_name] [varchar](200) NULL,
	[play_introduction] [varchar](2000) NULL,
	[play_image] [binary](1) NULL,
	[play_length] [int] NULL,
	[play_ticket_price] [numeric](10, 2) NULL,
	[play_status] [smallint] NULL,
 CONSTRAINT [PK_PLAY] PRIMARY KEY NONCLUSTERED 
(
	[play_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'取值含义：
   0：待安排演出
   1：已安排演出
   -1：下线' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'play', @level2type=N'COLUMN',@level2name=N'play_status'
GO
SET IDENTITY_INSERT [dbo].[play] ON
INSERT [dbo].[play] ([play_id], [play_type_id], [play_lang_id], [play_name], [play_introduction], [play_image], [play_length], [play_ticket_price], [play_status]) VALUES (7, 7, 15, N'神奇女侠', N'故事讲述盖尔·加朵饰演的亚马逊公主戴安娜·普林斯，经过在家乡天堂岛的训练，取得上帝赐予的武器与装备，化身神奇女侠，与克里斯·派恩饰演的空军上尉史蒂夫·特雷弗一同来到人类世界，一起捍卫和平、拯救世界，在一战期间上演了震撼人心的史诗传奇。', NULL, 133, CAST(27.00 AS Numeric(10, 2)), 1)
INSERT [dbo].[play] ([play_id], [play_type_id], [play_lang_id], [play_name], [play_introduction], [play_image], [play_length], [play_ticket_price], [play_status]) VALUES (9, 7, 15, N'加勒比海盗5：死无对证', N'亡灵萨拉查船长率领亡灵军队逃出百慕大三角区，扬言杀尽所有海盗，头号目标就是杰克船长。为对抗命运，杰克船长将起航寻找传说中海神波塞冬的三叉戟，因为这是能统治整个海洋的神器。波澜壮阔的海战争霸和史诗冒险就此展开。', NULL, 129, CAST(28.00 AS Numeric(10, 2)), 1)
INSERT [dbo].[play] ([play_id], [play_type_id], [play_lang_id], [play_name], [play_introduction], [play_image], [play_length], [play_ticket_price], [play_status]) VALUES (10, 4, 16, N'哆啦A梦：大雄的南极冰冰凉大冒险', N'夏天来了，经不住大雄的百般纠缠，哆啦A梦第一次同意带着小伙伴们来到南极，并建造了专属的南极乐园。没想到这场消夏之旅，被偶然发现的金环打断，快乐的旅程就此中止，他们来到十万年前的南极。这一次，哆啦A梦面临生死考验，地球也面临全面冻结的危险。没有了哆啦A梦，小伙伴们只能团结一心，才能拯救地球!', NULL, 101, CAST(23.00 AS Numeric(10, 2)), 1)
INSERT [dbo].[play] ([play_id], [play_type_id], [play_lang_id], [play_name], [play_introduction], [play_image], [play_length], [play_ticket_price], [play_status]) VALUES (11, 13, 15, N'摔跤吧！爸爸', N'这是一个温暖幽默的励志故事。马哈维亚辛格珀尕（阿米尔汗饰）曾是印度国家摔跤冠军，因生活所迫放弃摔跤。他希望让儿子可以帮他完成梦想——赢得世界级金牌。结果生了四个女儿本以为梦想就此破碎的辛格却意外发现女儿身上的惊人天赋，看到冠军希望的他决定不能让女儿的天赋浪费，像其他女孩一样只能洗衣做饭过一生，再三考虑之后，与妻子约定一年时间按照摔跤手的标准训练两个女儿：换掉裙子 、剪掉了长发，让她们练习摔跤，并赢得一个又一个冠军，最终赢来了成为榜样激励千千万万女性的机会。', NULL, 140, CAST(23.00 AS Numeric(10, 2)), 1)
INSERT [dbo].[play] ([play_id], [play_type_id], [play_lang_id], [play_name], [play_introduction], [play_image], [play_length], [play_ticket_price], [play_status]) VALUES (12, 13, 14, N'美好的意外', N'李雨燃(桂纶镁饰)是一位优秀的成功律师,过着高质量的白领单身生活,正在有条不紊地准备去海外留学充电,对美好的未来抱着无限的自信与憧憬。一天晚上,雨燃驱车回家,高速公路上不幸遭遇车祸,当她再度醒来时,发现自己置身于一个奇怪的场所,等待她的是七天不同角色生活的体验:一位全职太太。她的老公张涛(陈坤饰)是一位勤恳老实的设计师,女儿星星(欧阳娜娜饰)是一个叛逆的青春期少女,儿子天天(威廉饰)是一个天真温暖的男孩。从一位优秀的职业女性突然变成一个要照顾四口之家的家庭主妇的角色,雨燃经历了从一开始强硬的抗拒、不适应到后来温柔的爱护、关怀的转变', NULL, 104, CAST(28.00 AS Numeric(10, 2)), 1)
SET IDENTITY_INSERT [dbo].[play] OFF
/****** Object:  Table [dbo].[seat]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[seat](
	[seat_id] [int] IDENTITY(1,1) NOT NULL,
	[studio_id] [int] NULL,
	[seat_row] [int] NULL,
	[seat_column] [int] NULL,
	[seat_status] [smallint] NULL,
 CONSTRAINT [PK_SEAT] PRIMARY KEY NONCLUSTERED 
(
	[seat_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[seat] ON
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (133, 15, 1, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (134, 15, 1, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (135, 15, 1, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (136, 15, 1, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (137, 15, 1, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (138, 15, 1, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (139, 15, 1, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (140, 15, 1, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (141, 15, 2, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (142, 15, 2, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (143, 15, 2, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (144, 15, 2, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (145, 15, 2, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (146, 15, 2, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (147, 15, 2, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (148, 15, 2, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (149, 15, 3, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (150, 15, 3, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (151, 15, 3, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (152, 15, 3, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (153, 15, 3, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (154, 15, 3, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (155, 15, 3, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (156, 15, 3, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (157, 15, 4, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (158, 15, 4, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (159, 15, 4, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (160, 15, 4, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (161, 15, 4, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (162, 15, 4, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (163, 15, 4, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (164, 15, 4, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (165, 15, 5, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (166, 15, 5, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (167, 15, 5, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (168, 15, 5, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (169, 15, 5, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (170, 15, 5, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (171, 15, 5, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (172, 15, 5, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (173, 15, 6, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (174, 15, 6, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (175, 15, 6, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (176, 15, 6, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (177, 15, 6, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (178, 15, 6, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (179, 15, 6, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (180, 15, 6, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (181, 15, 7, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (182, 15, 7, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (183, 15, 7, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (184, 15, 7, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (185, 15, 7, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (186, 15, 7, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (187, 15, 7, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (188, 15, 7, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (189, 15, 8, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (190, 15, 8, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (191, 15, 8, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (192, 15, 8, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (193, 15, 8, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (194, 15, 8, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (195, 15, 8, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (196, 15, 8, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (197, 16, 1, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (198, 16, 1, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (199, 16, 1, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (200, 16, 1, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (201, 16, 1, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (202, 16, 1, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (203, 16, 1, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (204, 16, 1, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (205, 16, 1, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (206, 16, 1, 10, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (207, 16, 2, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (208, 16, 2, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (209, 16, 2, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (210, 16, 2, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (211, 16, 2, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (212, 16, 2, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (213, 16, 2, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (214, 16, 2, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (215, 16, 2, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (216, 16, 2, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (217, 16, 3, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (218, 16, 3, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (219, 16, 3, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (220, 16, 3, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (221, 16, 3, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (222, 16, 3, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (223, 16, 3, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (224, 16, 3, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (225, 16, 3, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (226, 16, 3, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (227, 16, 4, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (228, 16, 4, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (229, 16, 4, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (230, 16, 4, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (231, 16, 4, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (232, 16, 4, 6, 1)
GO
print 'Processed 100 total records'
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (233, 16, 4, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (234, 16, 4, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (235, 16, 4, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (236, 16, 4, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (237, 16, 5, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (238, 16, 5, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (239, 16, 5, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (240, 16, 5, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (241, 16, 5, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (242, 16, 5, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (243, 16, 5, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (244, 16, 5, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (245, 16, 5, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (246, 16, 5, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (247, 16, 6, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (248, 16, 6, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (249, 16, 6, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (250, 16, 6, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (251, 16, 6, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (252, 16, 6, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (253, 16, 6, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (254, 16, 6, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (255, 16, 6, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (256, 16, 6, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (257, 16, 7, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (258, 16, 7, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (259, 16, 7, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (260, 16, 7, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (261, 16, 7, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (262, 16, 7, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (263, 16, 7, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (264, 16, 7, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (265, 16, 7, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (266, 16, 7, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (267, 16, 8, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (268, 16, 8, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (269, 16, 8, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (270, 16, 8, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (271, 16, 8, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (272, 16, 8, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (273, 16, 8, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (274, 16, 8, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (275, 16, 8, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (276, 16, 8, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (277, 16, 9, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (278, 16, 9, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (279, 16, 9, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (280, 16, 9, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (281, 16, 9, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (282, 16, 9, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (283, 16, 9, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (284, 16, 9, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (285, 16, 9, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (286, 16, 9, 10, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (287, 16, 10, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (288, 16, 10, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (289, 16, 10, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (290, 16, 10, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (291, 16, 10, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (292, 16, 10, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (293, 16, 10, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (294, 16, 10, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (295, 16, 10, 9, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (296, 16, 10, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (297, 18, 1, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (298, 18, 1, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (299, 18, 1, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (300, 18, 1, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (301, 18, 1, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (302, 18, 1, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (303, 18, 1, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (304, 18, 1, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (305, 18, 2, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (306, 18, 2, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (307, 18, 2, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (308, 18, 2, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (309, 18, 2, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (310, 18, 2, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (311, 18, 2, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (312, 18, 2, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (313, 18, 3, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (314, 18, 3, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (315, 18, 3, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (316, 18, 3, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (317, 18, 3, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (318, 18, 3, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (319, 18, 3, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (320, 18, 3, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (321, 18, 4, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (322, 18, 4, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (323, 18, 4, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (324, 18, 4, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (325, 18, 4, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (326, 18, 4, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (327, 18, 4, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (328, 18, 4, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (329, 18, 5, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (330, 18, 5, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (331, 18, 5, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (332, 18, 5, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (333, 18, 5, 5, 0)
GO
print 'Processed 200 total records'
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (334, 18, 5, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (335, 18, 5, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (336, 18, 5, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (337, 18, 6, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (338, 18, 6, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (339, 18, 6, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (340, 18, 6, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (341, 18, 6, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (342, 18, 6, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (343, 18, 6, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (344, 18, 6, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (345, 18, 7, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (346, 18, 7, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (347, 18, 7, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (348, 18, 7, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (349, 18, 7, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (350, 18, 7, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (351, 18, 7, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (352, 18, 7, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (353, 18, 8, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (354, 18, 8, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (355, 18, 8, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (356, 18, 8, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (357, 18, 8, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (358, 18, 8, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (359, 18, 8, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (360, 18, 8, 8, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (361, 19, 1, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (362, 19, 1, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (363, 19, 1, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (364, 19, 1, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (365, 19, 1, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (366, 19, 1, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (367, 19, 2, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (368, 19, 2, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (369, 19, 2, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (370, 19, 2, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (371, 19, 2, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (372, 19, 2, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (373, 19, 3, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (374, 19, 3, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (375, 19, 3, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (376, 19, 3, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (377, 19, 3, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (378, 19, 3, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (379, 19, 4, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (380, 19, 4, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (381, 19, 4, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (382, 19, 4, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (383, 19, 4, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (384, 19, 4, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (385, 19, 5, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (386, 19, 5, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (387, 19, 5, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (388, 19, 5, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (389, 19, 5, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (390, 19, 5, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (391, 19, 6, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (392, 19, 6, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (393, 19, 6, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (394, 19, 6, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (395, 19, 6, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (396, 19, 6, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (397, 20, 1, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (398, 20, 1, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (399, 20, 1, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (400, 20, 1, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (401, 20, 1, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (402, 20, 1, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (403, 20, 1, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (404, 20, 1, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (405, 20, 1, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (406, 20, 1, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (407, 20, 1, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (408, 20, 1, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (409, 20, 1, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (410, 20, 1, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (411, 20, 1, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (412, 20, 2, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (413, 20, 2, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (414, 20, 2, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (415, 20, 2, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (416, 20, 2, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (417, 20, 2, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (418, 20, 2, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (419, 20, 2, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (420, 20, 2, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (421, 20, 2, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (422, 20, 2, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (423, 20, 2, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (424, 20, 2, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (425, 20, 2, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (426, 20, 2, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (427, 20, 3, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (428, 20, 3, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (429, 20, 3, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (430, 20, 3, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (431, 20, 3, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (432, 20, 3, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (433, 20, 3, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (434, 20, 3, 8, 1)
GO
print 'Processed 300 total records'
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (435, 20, 3, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (436, 20, 3, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (437, 20, 3, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (438, 20, 3, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (439, 20, 3, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (440, 20, 3, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (441, 20, 3, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (442, 20, 4, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (443, 20, 4, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (444, 20, 4, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (445, 20, 4, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (446, 20, 4, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (447, 20, 4, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (448, 20, 4, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (449, 20, 4, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (450, 20, 4, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (451, 20, 4, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (452, 20, 4, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (453, 20, 4, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (454, 20, 4, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (455, 20, 4, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (456, 20, 4, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (457, 20, 5, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (458, 20, 5, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (459, 20, 5, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (460, 20, 5, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (461, 20, 5, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (462, 20, 5, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (463, 20, 5, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (464, 20, 5, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (465, 20, 5, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (466, 20, 5, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (467, 20, 5, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (468, 20, 5, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (469, 20, 5, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (470, 20, 5, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (471, 20, 5, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (472, 20, 6, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (473, 20, 6, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (474, 20, 6, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (475, 20, 6, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (476, 20, 6, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (477, 20, 6, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (478, 20, 6, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (479, 20, 6, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (480, 20, 6, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (481, 20, 6, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (482, 20, 6, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (483, 20, 6, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (484, 20, 6, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (485, 20, 6, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (486, 20, 6, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (487, 20, 7, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (488, 20, 7, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (489, 20, 7, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (490, 20, 7, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (491, 20, 7, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (492, 20, 7, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (493, 20, 7, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (494, 20, 7, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (495, 20, 7, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (496, 20, 7, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (497, 20, 7, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (498, 20, 7, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (499, 20, 7, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (500, 20, 7, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (501, 20, 7, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (502, 20, 8, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (503, 20, 8, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (504, 20, 8, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (505, 20, 8, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (506, 20, 8, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (507, 20, 8, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (508, 20, 8, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (509, 20, 8, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (510, 20, 8, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (511, 20, 8, 10, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (512, 20, 8, 11, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (513, 20, 8, 12, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (514, 20, 8, 13, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (515, 20, 8, 14, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (516, 20, 8, 15, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (517, 20, 9, 1, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (518, 20, 9, 2, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (519, 20, 9, 3, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (520, 20, 9, 4, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (521, 20, 9, 5, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (522, 20, 9, 6, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (523, 20, 9, 7, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (524, 20, 9, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (525, 20, 9, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (526, 20, 9, 10, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (527, 20, 9, 11, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (528, 20, 9, 12, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (529, 20, 9, 13, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (530, 20, 9, 14, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (531, 20, 9, 15, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (532, 20, 10, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (533, 20, 10, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (534, 20, 10, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (535, 20, 10, 4, 0)
GO
print 'Processed 400 total records'
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (536, 20, 10, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (537, 20, 10, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (538, 20, 10, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (539, 20, 10, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (540, 20, 10, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (541, 20, 10, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (542, 20, 10, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (543, 20, 10, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (544, 20, 10, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (545, 20, 10, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (546, 20, 10, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (547, 20, 11, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (548, 20, 11, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (549, 20, 11, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (550, 20, 11, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (551, 20, 11, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (552, 20, 11, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (553, 20, 11, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (554, 20, 11, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (555, 20, 11, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (556, 20, 11, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (557, 20, 11, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (558, 20, 11, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (559, 20, 11, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (560, 20, 11, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (561, 20, 11, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (562, 20, 12, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (563, 20, 12, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (564, 20, 12, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (565, 20, 12, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (566, 20, 12, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (567, 20, 12, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (568, 20, 12, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (569, 20, 12, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (570, 20, 12, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (571, 20, 12, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (572, 20, 12, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (573, 20, 12, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (574, 20, 12, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (575, 20, 12, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (576, 20, 12, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (577, 20, 13, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (578, 20, 13, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (579, 20, 13, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (580, 20, 13, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (581, 20, 13, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (582, 20, 13, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (583, 20, 13, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (584, 20, 13, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (585, 20, 13, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (586, 20, 13, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (587, 20, 13, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (588, 20, 13, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (589, 20, 13, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (590, 20, 13, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (591, 20, 13, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (592, 20, 14, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (593, 20, 14, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (594, 20, 14, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (595, 20, 14, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (596, 20, 14, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (597, 20, 14, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (598, 20, 14, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (599, 20, 14, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (600, 20, 14, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (601, 20, 14, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (602, 20, 14, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (603, 20, 14, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (604, 20, 14, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (605, 20, 14, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (606, 20, 14, 15, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (607, 20, 15, 1, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (608, 20, 15, 2, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (609, 20, 15, 3, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (610, 20, 15, 4, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (611, 20, 15, 5, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (612, 20, 15, 6, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (613, 20, 15, 7, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (614, 20, 15, 8, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (615, 20, 15, 9, 1)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (616, 20, 15, 10, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (617, 20, 15, 11, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (618, 20, 15, 12, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (619, 20, 15, 13, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (620, 20, 15, 14, 0)
INSERT [dbo].[seat] ([seat_id], [studio_id], [seat_row], [seat_column], [seat_status]) VALUES (621, 20, 15, 15, 0)
SET IDENTITY_INSERT [dbo].[seat] OFF
/****** Object:  Table [dbo].[schedule]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[schedule](
	[sched_id] [int] IDENTITY(1,1) NOT NULL,
	[studio_id] [int] NULL,
	[play_id] [int] NULL,
	[sched_time] [datetime] NOT NULL,
	[sched_ticket_price] [numeric](10, 2) NULL,
 CONSTRAINT [PK_SCHEDULE] PRIMARY KEY NONCLUSTERED 
(
	[sched_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[schedule] ON
INSERT [dbo].[schedule] ([sched_id], [studio_id], [play_id], [sched_time], [sched_ticket_price]) VALUES (3, 15, 7, CAST(0x0000A79B00000000 AS DateTime), CAST(45.00 AS Numeric(10, 2)))
INSERT [dbo].[schedule] ([sched_id], [studio_id], [play_id], [sched_time], [sched_ticket_price]) VALUES (6, 16, 9, CAST(0x0000A78E016A8C80 AS DateTime), CAST(48.00 AS Numeric(10, 2)))
INSERT [dbo].[schedule] ([sched_id], [studio_id], [play_id], [sched_time], [sched_ticket_price]) VALUES (7, 18, 10, CAST(0x0000A79800C5C100 AS DateTime), CAST(28.00 AS Numeric(10, 2)))
INSERT [dbo].[schedule] ([sched_id], [studio_id], [play_id], [sched_time], [sched_ticket_price]) VALUES (8, 19, 11, CAST(0x0000A79A0128A180 AS DateTime), CAST(88.00 AS Numeric(10, 2)))
INSERT [dbo].[schedule] ([sched_id], [studio_id], [play_id], [sched_time], [sched_ticket_price]) VALUES (9, 20, 12, CAST(0x0000A7A20107AC00 AS DateTime), CAST(18.00 AS Numeric(10, 2)))
SET IDENTITY_INSERT [dbo].[schedule] OFF
/****** Object:  Table [dbo].[sale_item]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sale_item](
	[sale_item_id] [bigint] IDENTITY(1,1) NOT NULL,
	[ticket_id] [bigint] NULL,
	[sale_ID] [bigint] NULL,
	[sale_item_price] [numeric](10, 2) NULL,
 CONSTRAINT [PK_SALE_ITEM] PRIMARY KEY NONCLUSTERED 
(
	[sale_item_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ticket]    Script Date: 06/07/2017 08:23:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ticket](
	[ticket_id] [bigint] IDENTITY(1,1) NOT NULL,
	[seat_id] [int] NULL,
	[sched_id] [int] NULL,
	[ticket_price] [numeric](10, 2) NULL,
	[ticket_status] [smallint] NULL,
	[ticket_locked_time] [datetime] NULL,
 CONSTRAINT [PK_TICKET] PRIMARY KEY NONCLUSTERED 
(
	[ticket_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'含义如下：
   0：待销售
   1：锁定
   9：卖出' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ticket', @level2type=N'COLUMN',@level2name=N'ticket_status'
GO
SET IDENTITY_INSERT [dbo].[ticket] ON
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (1, 151, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (2, 152, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (3, 153, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (4, 154, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (5, 158, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (6, 159, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (7, 160, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (8, 161, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (9, 162, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (10, 163, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (11, 165, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (12, 166, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (13, 167, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (14, 168, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (15, 169, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (16, 170, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (17, 171, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (18, 172, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (19, 145, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (20, 144, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (21, 143, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (22, 136, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (23, 206, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (24, 215, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (25, 224, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (26, 233, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (27, 242, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (28, 251, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (29, 260, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (30, 269, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (31, 278, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (32, 287, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (33, 231, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (34, 220, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (35, 209, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (36, 198, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (37, 253, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (38, 264, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (39, 275, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (40, 286, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (41, 297, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (42, 298, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (43, 299, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (44, 300, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (45, 301, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (46, 302, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (47, 303, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (48, 304, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (49, 312, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (50, 311, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (51, 310, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (52, 309, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (53, 308, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (54, 307, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (55, 306, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (56, 305, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (57, 313, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (58, 314, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (59, 315, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (60, 316, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (61, 317, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (62, 318, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (63, 320, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (64, 319, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (65, 328, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (66, 327, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (67, 326, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (68, 325, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (69, 324, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (70, 323, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (71, 322, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (72, 321, 7, CAST(28.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (73, 361, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (74, 368, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (75, 375, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (76, 382, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (77, 389, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (78, 396, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (79, 366, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (80, 371, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (81, 376, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (82, 381, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (83, 386, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (84, 391, 8, CAST(88.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (85, 405, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (86, 420, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (87, 435, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (88, 450, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (89, 465, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (90, 480, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (91, 495, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (92, 510, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (93, 525, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (94, 540, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (95, 555, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (96, 570, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (97, 585, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (98, 600, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (99, 615, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (100, 404, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
GO
print 'Processed 100 total records'
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (101, 419, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (102, 434, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (103, 449, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (104, 464, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (105, 479, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (106, 494, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (107, 509, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (108, 524, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (109, 539, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (110, 554, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (111, 569, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (112, 584, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (113, 599, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (114, 614, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (115, 508, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (116, 507, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (117, 506, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (118, 505, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (119, 503, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (120, 504, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (121, 502, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (122, 517, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (123, 518, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (124, 519, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (125, 520, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (126, 521, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (127, 522, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (128, 523, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (129, 526, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (130, 511, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (131, 512, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (132, 513, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (133, 514, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (134, 515, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (135, 516, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (136, 531, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (137, 530, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (138, 529, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (139, 528, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (140, 527, 9, CAST(18.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (141, 133, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (142, 141, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (143, 149, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (144, 157, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (145, 173, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (146, 181, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (147, 189, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (148, 202, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (149, 212, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (150, 222, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (151, 232, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (152, 252, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (153, 262, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (154, 272, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (155, 282, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (156, 292, 6, CAST(48.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (157, 176, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (158, 177, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (159, 140, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (160, 148, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (161, 138, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (162, 139, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (163, 140, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (164, 147, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (165, 148, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (166, 179, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (167, 180, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (168, 139, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (169, 140, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (170, 148, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
INSERT [dbo].[ticket] ([ticket_id], [seat_id], [sched_id], [ticket_price], [ticket_status], [ticket_locked_time]) VALUES (171, 147, 3, CAST(45.00 AS Numeric(10, 2)), 1, NULL)
SET IDENTITY_INSERT [dbo].[ticket] OFF
/****** Object:  ForeignKey [FK_DATA_DIC_SUPER_CHI_DATA_DIC]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[data_dict]  WITH CHECK ADD  CONSTRAINT [FK_DATA_DIC_SUPER_CHI_DATA_DIC] FOREIGN KEY([dict_parent_id])
REFERENCES [dbo].[data_dict] ([dict_id])
GO
ALTER TABLE [dbo].[data_dict] CHECK CONSTRAINT [FK_DATA_DIC_SUPER_CHI_DATA_DIC]
GO
/****** Object:  ForeignKey [FK_PLAY_DICT_LAN__DATA_DIC]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[play]  WITH CHECK ADD  CONSTRAINT [FK_PLAY_DICT_LAN__DATA_DIC] FOREIGN KEY([play_lang_id])
REFERENCES [dbo].[data_dict] ([dict_id])
GO
ALTER TABLE [dbo].[play] CHECK CONSTRAINT [FK_PLAY_DICT_LAN__DATA_DIC]
GO
/****** Object:  ForeignKey [FK_PLAY_DICT_TYPE_DATA_DIC]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[play]  WITH CHECK ADD  CONSTRAINT [FK_PLAY_DICT_TYPE_DATA_DIC] FOREIGN KEY([play_type_id])
REFERENCES [dbo].[data_dict] ([dict_id])
GO
ALTER TABLE [dbo].[play] CHECK CONSTRAINT [FK_PLAY_DICT_TYPE_DATA_DIC]
GO
/****** Object:  ForeignKey [FK_SALE_EMPLOYEE__EMPLOYEE]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[sale]  WITH CHECK ADD  CONSTRAINT [FK_SALE_EMPLOYEE__EMPLOYEE] FOREIGN KEY([emp_id])
REFERENCES [dbo].[employee] ([emp_id])
GO
ALTER TABLE [dbo].[sale] CHECK CONSTRAINT [FK_SALE_EMPLOYEE__EMPLOYEE]
GO
/****** Object:  ForeignKey [FK_SALE_ITE_SALE_SALE_SALE]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[sale_item]  WITH CHECK ADD  CONSTRAINT [FK_SALE_ITE_SALE_SALE_SALE] FOREIGN KEY([sale_ID])
REFERENCES [dbo].[sale] ([sale_ID])
GO
ALTER TABLE [dbo].[sale_item] CHECK CONSTRAINT [FK_SALE_ITE_SALE_SALE_SALE]
GO
/****** Object:  ForeignKey [FK_SCHEDULE_PLAY_SCHE_PLAY]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[schedule]  WITH CHECK ADD  CONSTRAINT [FK_SCHEDULE_PLAY_SCHE_PLAY] FOREIGN KEY([play_id])
REFERENCES [dbo].[play] ([play_id])
GO
ALTER TABLE [dbo].[schedule] CHECK CONSTRAINT [FK_SCHEDULE_PLAY_SCHE_PLAY]
GO
/****** Object:  ForeignKey [FK_SCHEDULE_STUDIO_SC_STUDIO]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[schedule]  WITH CHECK ADD  CONSTRAINT [FK_SCHEDULE_STUDIO_SC_STUDIO] FOREIGN KEY([studio_id])
REFERENCES [dbo].[studio] ([studio_id])
GO
ALTER TABLE [dbo].[schedule] CHECK CONSTRAINT [FK_SCHEDULE_STUDIO_SC_STUDIO]
GO
/****** Object:  ForeignKey [FK_SEAT_STUDIO_SE_STUDIO]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[seat]  WITH CHECK ADD  CONSTRAINT [FK_SEAT_STUDIO_SE_STUDIO] FOREIGN KEY([studio_id])
REFERENCES [dbo].[studio] ([studio_id])
GO
ALTER TABLE [dbo].[seat] CHECK CONSTRAINT [FK_SEAT_STUDIO_SE_STUDIO]
GO
/****** Object:  ForeignKey [FK_TICKET_SCHED_TIC_SCHEDULE]    Script Date: 06/07/2017 08:23:07 ******/
ALTER TABLE [dbo].[ticket]  WITH CHECK ADD  CONSTRAINT [FK_TICKET_SCHED_TIC_SCHEDULE] FOREIGN KEY([sched_id])
REFERENCES [dbo].[schedule] ([sched_id])
GO
ALTER TABLE [dbo].[ticket] CHECK CONSTRAINT [FK_TICKET_SCHED_TIC_SCHEDULE]
GO
