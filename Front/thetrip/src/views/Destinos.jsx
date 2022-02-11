import React from "react";

export default function Destinos(){
    return (
        <>
            <br/>
            <button type="button" id="btnCriar">Criar novo destino</button>
            <table class="table" id="tabela">
                <thead>
                    <tr id="tituloTabela">
                        <th>
                            Cidade de destino
                        </th>
                        <th>
                            Estado de destino
                        </th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            João Pessoa
                        </td>
                        <td>
                            Paraíba
                        </td>
                        <td>
                            <button type="button" id="btnEditar">Editar</button> |
                            <button type="button" id="btnDetalhes">Detalhes</button> |
                            <button type="button" id="btnDeletar">Deletar</button>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Angra dos Reis
                        </td>
                        <td>
                            Rio de Janeiro
                        </td>
                        <td>
                            <button type="button" id="btnEditar">Editar</button> |
                            <button type="button" id="btnDetalhes">Detalhes</button> |
                            <button type="button" id="btnDeletar">Deletar</button>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Recreio dos Bandeirantes
                        </td>
                        <td>
                            Rio de Janeiro
                        </td>
                        <td>
                            <button type="button" id="btnEditar">Editar</button> |
                            <button type="button" id="btnDetalhes">Detalhes</button> |
                            <button type="button" id="btnDeletar">Deletar</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </>
    )
}