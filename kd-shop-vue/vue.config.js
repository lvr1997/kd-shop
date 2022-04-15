module.exports = {
	devServer: {
		proxy: {
			'/api': {
				target: 'http://localhost:8086',
				ws: true,
				changeOrigin: true
			}
		}
	}
}
