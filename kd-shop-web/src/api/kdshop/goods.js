import request from '@/utils/request'

// 查询闲置物品列表
export function listGoods(query) {
  return request({
    url: '/kdshop/goods/list',
    method: 'get',
    params: query
  })
}

// 查询闲置物品详细
export function getGoods(id) {
  return request({
    url: '/kdshop/goods/' + id,
    method: 'get'
  })
}

// 新增闲置物品
export function addGoods(data) {
  return request({
    url: '/kdshop/goods',
    method: 'post',
    data: data
  })
}

// 修改闲置物品
export function updateGoods(data) {
  return request({
    url: '/kdshop/goods',
    method: 'put',
    data: data
  })
}

// 删除闲置物品
export function delGoods(id) {
  return request({
    url: '/kdshop/goods/' + id,
    method: 'delete'
  })
}

// 导出闲置物品
export function exportGoods(query) {
  return request({
    url: '/kdshop/goods/export',
    method: 'get',
    params: query
  })
}