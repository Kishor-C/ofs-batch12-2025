<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
		<html>
			<body>
				<h2>Book List</h2>
				<table border="1">
					<tr bgcolor="yellow">
						<th>ID</th>
						<th>Author</th>
						<th>Title</th>
					</tr>
					<xsl:for-each select="books/book">
						<tr>
							<td><xsl:value-of select="@id"/></td>
							<td><xsl:value-of select="author"/></td>
							<td><xsl:value-of select="title"/></td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
