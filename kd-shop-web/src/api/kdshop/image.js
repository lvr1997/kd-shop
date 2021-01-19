import request from '@/utils/request'

// 查询闲置图片列表
export function listImage(query) {
  return request({
    url: '/kdshop/image/list',
    method: 'get',
    params: query
  })
}

// 查询闲置图片详细
export function getImage(id) {
  return request({
    url: '/kdshop/image/' + id,
    method: 'get'
  })
}

// 新增闲置图片
export function addImage(data) {
  return request({
    url: '/kdshop/image',
    method: 'post',
    data: data
  })
}

// 修改闲置图片
export function updateImage(data) {
  return request({
    url: '/kdshop/image',
    method: 'put',
    data: data
  })
}

// 删除闲置图片
export function delImage(id) {
  return request({
    url: '/kdshop/image/' + id,
    method: 'delete'
  })
}

// 导出闲置图片
export function exportImage(query) {
  return request({
    url: '/kdshop/image/export',
    method: 'get',
    params: query
  })
}